pipeline {
    agent any
    tools{
        maven 'maven_3_9_5'
    }
    stages{
        stage('Build Maven Project'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/snehalwagh2121/spring-jenkins']])
                bat 'mvn clean install'

            }
        }
        stage('Build docker file'){
            steps{
                bat 'docker build -t snehalwagh2121/jenkins-integration .'

            }
        }
        stage('Push image to Dockerhub'){
            steps{
                withCredentials([string(credentialsId: 'dockerhub', variable: 'dockerhub')]) {
                    bat 'docker login -u snehalwagh2121 -p ${dockerhub}'
                }
                bat 'docker push snehalwagh2121/jenkins-integration'
            }
        }
    }
}
