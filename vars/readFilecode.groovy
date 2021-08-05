#!/usr/bin/env groovy

def call(String filepath ) {
  new File("output.csv") << new URL ("${filepath}").getText()
  new File("output.csv").eachLine { line ->
    println line
}
  
 
   
}
