pipeline {
    agent any
        tools{
            maven 'maven_3_9_9'
        }
    stages{
        stage('Build Maven'){
            steps{
            checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/RahulLeo10/SpringBootDcokerMysql.git']])
            bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps{
            bat 'docker build --rm -t rahul870/dockermysql:0.0.1 .'
            echo 'Docker Build Image Completed'
           }
        }
        stage('Build Compose') {
            steps{
            bat 'docker-compose up -d'
            echo 'Docker-compose-build Build Image Completed'
           }
        }
        stage('Cleanup') {
             steps {
              bat 'docker-compose down'
              }
        }
    }

}