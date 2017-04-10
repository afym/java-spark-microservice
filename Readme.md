### Build the image

```
$ docker build -t microservice-spark .
```

### Run the container

```
$ docker run -d -p 4567:4567 microservice-spark
```

### Test the functions

* curl localhost/
* curl localhost/v1/products

### Stop the container

```
$ docker rm <container-id> -f
```