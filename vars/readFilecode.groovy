#!/usr/bin/env groovy

def call(String filepath ) {
  new File(filepath).eachLine { line ->
    println line
}
  
 
   
}
