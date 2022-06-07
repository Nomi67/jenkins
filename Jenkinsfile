pipeline {
    agent any
    stages{
        stage("build"){
            steps {
                sh 'ls'
                echo 'building the application.'
                sh 'mvn -version'
                sh 'mvn clean install'
                echo 'After building the directory contains'
                sh 'ls ./target'
            }
        }
         stage("test"){
            steps {
                echo 'testing the application.'
            }
        }
        stage("deploy"){
            steps {
                echo 'deploying the application.'
                sh 'java -jar ./target/logging-demo-0.0.1-SNAPSHOT.jar &'
            }
        } 
    }
}
