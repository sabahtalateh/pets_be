# default envs
DB_HOST ?= localhost
DB_PORT ?= 12345
DB_NAME ?= pets
DB_USER ?= postgres
DB_PASSWORD ?= postgres

docker-infra:
	DB_PORT=${DB_PORT} DB_NAME=${DB_NAME} DB_USER=${DB_USER} DB_PASSWORD=${DB_PASSWORD} docker-compose -f build/devenv/infra.yml up

docker-infra-d:
	DB_PORT=${DB_PORT} DB_NAME=${DB_NAME} DB_USER=${DB_USER} DB_PASSWORD=${DB_PASSWORD} docker-compose -f build/devenv/infra.yml up -d

docker-infra-d-down:
	DB_PORT=${DB_PORT} DB_NAME=${DB_NAME} DB_USER=${DB_USER} DB_PASSWORD=${DB_PASSWORD} docker-compose -f build/devenv/infra.yml down

liberty-dev:
	DB_HOST=${DB_HOST} DB_PORT=${DB_PORT} DB_NAME=${DB_NAME} DB_USER=${DB_USER} DB_PASSWORD=${DB_PASSWORD} ./mvnw liberty:dev

infra+dev: docker-infra-d liberty-dev
