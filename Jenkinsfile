pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Running grrovy code with version:.'
                echo GroovySystem.version
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
 
