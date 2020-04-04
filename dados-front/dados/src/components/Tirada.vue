<template>
  <div class="hello">
    
    <div style="margin: 50px;">
      <h1 >Pulsa el botón para tirar los dados</h1>
      <p>Hay que esperar tantos segundos como el resultado</p>
    </div>
    
    <p style="margin: 50px;">
        <b-button size="lg" pill :variant="estilo" @click="tirar()" style="cursor: pointer" :disabled="lanzando">
          <span v-if="!lanzando">Tirar</span>
          <span v-if="lanzando">
            <b-spinner small></b-spinner> Tirando...
          </span>
        </b-button>
    </p>
    
    <div v-if="!lanzando">
      <p style="margin: 50px;">
        <img alt="Vue logo" :src="'dice6-' +  tirada[0] + '.png'" width="200px" style="margin: 10px;">

        <img alt="Vue logo" :src="'dice6-' +  tirada[1] + '.png'" width="200px" style="margin: 10px;">
        
        <img alt="Vue logo" :src="'dice6-' +  tirada[2] + '.png'" width="200px" style="margin: 10px;">
      </p>
    </div>  
  </div>
</template>

<script>
export default {
    data() {
      return {
        lanzando: false,
        tirada: [1,2,6],
        estilo: 'outline-primary'
      }
    },
    methods: {
      tirar() {
        const axios = require('axios');
        this.lanzando = true;
        this.estilo = 'warning';

        axios.get('http://127.0.0.1:8081/dados-tirada-service/tirada/3d6')
        .then(response => {
           console.log(response);
           if (response.status == 200){
             this.tirada = response.data.valores;
           }
           this.estilo = 'outline-primary';
           this.lanzando = false;
        }
        );
       
      }
    }


}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
