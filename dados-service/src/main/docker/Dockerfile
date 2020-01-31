FROM adoptopenjdk:11-jre-hotspot

# Metadata
LABEL module.maintainer="jmlorenzo50" \
	  module.name="${project.artifactId}"

COPY  [ "${project.artifactId}-${project.version}-exec.jar", "/app.jar" ]

RUN sh -c 'touch /app.jar'

VOLUME [ "/tmp" ]
    
ENV JAVA_OPTS="$JAVA_OPTS -Xms256M -Xmx1G" \
    SERVER_PORT=8080

EXPOSE ${SERVER_PORT}

ENTRYPOINT java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
