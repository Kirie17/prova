pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Kirie17/prova.git'
            }
        }
        stage('Build') {
            steps {
                bat 'dotnet build' 
            }
        }
        stage('Test') {
            steps {
                bat 'dotnet test'
            }
        }
    }
}
