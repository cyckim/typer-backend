FROM mysql:8.0.26

ENV MYSQL_DATABASE=typer \
    MYSQL_ROOT_PASSWORD=root

ADD data.sql /docker-entrypoint-initdb.d

EXPOSE 3306