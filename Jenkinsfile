node {
    
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/sdindiver/springboot-tournament-portal.git'

   }
   stage('Build') {
       sh "mvn -Dmaven.test.failure.ignore clean package"
         sh "docker build -f ./dockerFile -t indiver/new-subtournament ."
         sh "echo 'login TO ECS......'"
         sh "eval \"\$( aws ecr get-login --region ap-south-1 --no-include-email)\""
         sh "echo 'login Completed To ECS......'"
         sh "docker tag indiver/new-subtournament 194241487024.dkr.ecr.ap-south-1.amazonaws.com/subtournament"
         sh "docker push 194241487024.dkr.ecr.ap-south-1.amazonaws.com/subtournament"
   }
    stage('clean') {
        sh "docker images --quiet --filter=dangling=true | xargs --no-run-if-empty docker rmi -f"
   }

}
