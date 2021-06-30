def call(String name = 'human') {

  echo "Hello, ${name}."
  new File("https://github.com/KirtiPhirke98/pipeline-library-demo/blob/master/vars/Hello.csv").eachLine {  
         line -> println "$line"; 
}
}