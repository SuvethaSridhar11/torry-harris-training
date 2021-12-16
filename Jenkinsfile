pipeline {
    agent any

     stages {
        stage('Initialize') {
             steps {
                echo "Hello World"
                echo "${BUILD_NUMBER}"
             }
        }

        stage('Run Test ') {
              steps {
                echo "Hello World"
                echo "${JOB_NAME}"
              }
        }
     }
}