pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Running grrovy code to parse json:.'
                sh 'pwd'
                jsonParser = new JSONFileReader()
        result = jsonParser.readJSONTreeData("jsondata.txt")
  println result
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
 
