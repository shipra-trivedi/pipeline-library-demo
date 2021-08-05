#!/usr/bin/env groovy

def call(String filepath ) {
   
  //def filePath = readFile "Hello.csv"                   
	def lines = filePath.readLines()
	 def linesbyline = filePath.readLines() 
      
	for (line in linesbyline) {                                            
                      
                        println "$line"
                        }  
  
 
   
}
