FROM airhacks/glassfish
COPY ./target/city-backend.war ${DEPLOYMENT_DIR}
