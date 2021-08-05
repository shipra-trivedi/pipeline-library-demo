@Library('pipeline_library')_
pipeline {
       agent any
       stages{
       
        stage("Checkout Code") {
                               steps {
                                        
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/shipra-trivedi/pipeline-library-demo.git']]])
                                    }
                                }
        stage("build")
        {
            steps
            {
                  script{
    git branch: 'master', url: 'https://github.com/shipra-trivedi/pipeline-library-demo.git'
    def filePath = readFile "Hello.csv"                  
    def lines = filePath.readLines()
    def linesbyline = filePath.readLines()
     
    for (line in linesbyline) {                                           
                     
                        println "$line"
                        }
                                       }
            }
        }
       }
       post {
        always {
           // emailext body: '${env.BUILD_URL} has result ${currentBuild.result}', subject: 'test email', to: 'kirti1234p@gmail.com'
            mail to: 'shipra1234p@gmail.com',
          subject: "Status of pipeline: ${currentBuild.fullDisplayName}",
          body: "${env.BUILD_URL} has result ${currentBuild.result}"
        }
    }
}
    }
}
