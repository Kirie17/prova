pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout do repositório
                git 'https://github.com/Kirie17/prova.git'
            }
        }

        stage('Build') {
            steps {
                // Compila o código usando o Maven no Windows (cmd)
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Executa testes no Windows
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                // Executa o deploy no Windows
                bat 'echo Deploying the application...'
            }
        }
    }

    post {
        always {
            // Comando sempre executado após o pipeline
            bat 'echo Cleaning up...'
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
