pipeline {
    agent any 
    stages {
        stage('build') {
            steps {
                sh 'mvn clean compile'  //sh on linux instead of bat
            }
        }
 	stage('test') {
            steps {
                sh 'mvn package'  //sh on linux instead of bat
            }
	    post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
