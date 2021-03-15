@Library('My-Shared-Lib') _  
node {
     
    stage('Parser') {        
      echo 'Running grrovy code to parse json:.'
       sh 'pwd'
jsonParser = new com.data.JSONFileReader()
        result = jsonParser.readJSONTreeData("jsondata.json")
  println result
         
    }
    stage('Build') {
         
             
         echo 'Running Build'
    }
     
    
}

