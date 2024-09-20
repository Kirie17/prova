pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Pega o código do repositório
                git 'https://github.com/Kirie17/prova.git'
            }
        }

        stage('Build') {
            steps {
                // Executa o comando de build (Maven no caso)
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Executa testes unitários
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            when {
                branch 'main'
            }
            steps {
                // Comando para deploy (pode ser customizado)
                sh 'echo Deploying the application...'
            }
        }
    }

    post {
        always {
            // Passo sempre executado após o pipeline (por exemplo, limpar o ambiente)
            sh 'echo Cleaning up...'
        }
        success {
            echo 'Build succeeded!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
