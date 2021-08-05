#!/usr/bin/env groovy

def call(String filepath ) {
  new File("https://github.com/KirtiPhirke98/pipeline-library-demo/blob/master/vars/Hello.csv").eachLine { line ->
    println line
}
  
 
   
}
