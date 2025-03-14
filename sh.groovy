pipeline {
    agent any
    stages{
       stage('test') {
          steps {
             echo 'hello from jenkins pipeline!'
         }
} 
} 
}
