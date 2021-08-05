#!/usr/bin/env groovy

def call(String str ) {
   
	def fileLocation = 'str'
def fileURL = new URL(fileLocation)
def remoteFile = new File(fileURL.toURI())
	
	def filePath = readFile "${remoteFile}"                   
	def lines = filePath.readLines()
	 def linesbyline = filePath.readLines() 
      
	for (line in linesbyline) {                                            
                      
                        println "$line"
                        }  
  
 
   
}
