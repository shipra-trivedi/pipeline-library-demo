#!/usr/bin/env groovy

def call(String name = 'human') {
  new File("Hello.csv").eachLine { line ->
    println line
}

  echo "Hello, ${name}."
}

