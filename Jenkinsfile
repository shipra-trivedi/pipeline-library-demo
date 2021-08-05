@Library('Kirti-shared@master')_
pipeline {
agent any
stages{
stage('Demo') {
steps
{
echo 'Hello world'
sayHello 'Kirti'
}
}
stage("build")
{
steps
{
script{
def filePath = readFile "Hello.csv"
def lines = filePath.readLines()
def linesbyline = filePath.readLines()
for (line in linesbyline) {
println "$line"}
}
}
}
}
post {
always {
// emailext body: '${env.BUILD_URL} has result ${currentBuild.result}', subject: 'test email', to: 'kirti1234p@gmail.com'
mail to: 'kirti1234p@gmail.com',
subject: "Status of pipeline: ${currentBuild.fullDisplayName}",
body: "${env.BUILD_URL} has result ${currentBuild.result}"
}
}
}
