@Library('pipeline_library')_

pipeline {
    agent any
    stages {
        stage('Demo') {
            steps {
                echo 'Hello World'
                hello 'Shipra Trivedi'
            }
        }
        stage('Build') {
            steps {
                script{
                    //git branch: 'master', url: 'https://github.com/shipra-trivedi/pipeline-library-demo.git'
                    def filePath = readFile "Hello.csv"
                    def lines = filePath.readLines()
                    for (line in lines) {
                        println "$line"
                    }
                }
            }
        }
        stage('Email Notification') {
            steps {
                echo 'Sending Email !!'
                emailext ( attachLog: true,
                body: """<p>EXECUTED: Job <b>\'${env.JOB_NAME} : ${env.BUILD_NUMBER}\'</b></p>
                <p>View console output at <a href="${env.BUILD_URL}">Jenkins ${env.JOB_NAME}:${env.BUILD_NUMBER}</a></p>""",
                recipientProviders: [requestor(), buildUser()],
                replyTo: 'do-not-reply@company.com',
                subject: """Status: ${currentBuild.result?:'SUCCESS'} - Job \'${env.JOB_NAME}:${env.BUILD_NUMBER}\'""",
                to: 'shipratrivedi1234@gmail.com' )
            }
        }
    }
}
