//JsonReadScript.groovy
  jsonParser = new JSONFileReader()
        result = jsonParser.readJSONTreeData("jsondata.txt")
  println result
