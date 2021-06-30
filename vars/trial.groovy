def call(String name = 'human') {

  echo "Hello, ${name}."
  new File("vars/Hello.csv").eachLine {  
         line -> println "$line"; 
}
}