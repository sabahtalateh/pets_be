./mvnw clean \
  resources:resources \
  compiler:compile \
  liberty:create \
  liberty:install-feature \
  liberty:deploy \
  liberty:package -Dinclude=runnable

# DB_HOST=localhost DB_PORT=12345 DB_NAME=pets DB_USER=postgres DB_PASSWORD=postgres java -jar ./target/pets.jar
