  node {
     
    stage('Parser') {        
      echo 'Running grrovy code to parse json:.'
       sh 'pwd'
jsonParser = new com.data.JSONFileReader()
        result = jsonParser.readJSONTreeData("jsondata.txt")
  println result
         
    }
    stage('Build') {
         
             
         echo 'Running Build'
    }
     
    
}

