#!/usr/bin/env groovy

def call(String name = 'human') {
  new File("name").eachLine { line ->
    println line
}

  echo "Hello, ${name}."
}

