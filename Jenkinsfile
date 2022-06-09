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
                sh 'sudo cp ./target/logging-demo-0.0.1-SNAPSHOT.jar /usr/local/rvt/jenkins-projects/logging-demo-0.0.1-SNAPSHOT.jar'
                sh 'sudo cp ./target/application.properties /usr/local/rvt/jenkins-projects/application.properties'
                sh 'sudo cp -r ./target/dependency-jars /usr/local/rvt/jenkins-projects/dependency-jars'
                sh 'sudo cp ./logback.xml /usr/local/rvt/jenkins-projects/logback.xml'
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
            }
        } 
    }
}
