FROM tomcat:jdk8

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH
RUN mkdir -p "$CATALINA_HOME"
WORKDIR $CATALINA_HOME
COPY ./build/libs/* /usr/local/tomcat/webapps

EXPOSE 8080
CMD ["catalina.sh", "run"]