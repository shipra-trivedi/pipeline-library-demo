#!/usr/bin/env groovy

def call(String filepath ) {
  new File("src/main/resources/fileContent.txt").eachLine { line ->
    println line
}
  
 
   
}
