FROM adoptopenjdk:11-jre-hotspot

# Metadata
LABEL module.maintainer="jmlorenzo50" \
	  module.name="dados-service"

COPY  [ "dados-service-1.0.0-SNAPSHOT-exec.jar", "/app.jar" ]

RUN sh -c 'touch /app.jar'

VOLUME [ "/tmp" ]
    
ENV JAVA_OPTS="$JAVA_OPTS -Xms256M -Xmx1G" \
    SERVER_PORT=2020

EXPOSE ${SERVER_PORT}

ENTRYPOINT java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
