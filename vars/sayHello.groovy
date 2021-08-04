#!/usr/bin/env groovy

def call(String name = 'human') {
  def filePath = readFile "Hello.csv"                   
	def lines = filePath.readLines()
	 def linesbyline = filePath.readLines() 
      
	for (line in linesbyline) {                                            
                      
                        println "$line"
                        }  
}
  echo "Hello, ${name}."
}

