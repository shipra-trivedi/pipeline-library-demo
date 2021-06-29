def call(String name = 'human') {

  echo "Hello, ${name}."
  new File("Hello.csv").eachLine {  
         line -> println "$line"; 
}
}