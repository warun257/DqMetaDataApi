String projectbase = new StringBuilder(".")
                            .append(File.separator)
                            .append("target")
                            .append(File.separator)
                            .append("it")
                            .append(File.separator)
                            .append("simple-it-default-values")
                        .toString();
String statementPackagePath = new StringBuilder(projectbase)
                            .append(File.separator)
                            .append("target")
                            .append(File.separator)
                            .append("classes")
                            .append(File.separator)
                            .append("com")
                            .append(File.separator)
                            .append("paypal")
                            .append(File.separator)
                            .append("credit")
                            .append(File.separator)
                            .append("statement")
                        .toString();
String apiDirPath = new StringBuilder(statementPackagePath).append(File.separator).append("api").toString();
String datatypeDirPath = new StringBuilder(statementPackagePath).append(File.separator).append("model").toString();


//Check folders exists
assert new File(apiDirPath).exists()
assert new File(datatypeDirPath).exists()

//Check resource class exists
assert new File(apiDirPath + File.separator + "StatementsResource.class").exists()

//Check all datatypes exists
assert new File(datatypeDirPath + File.separator + "StatementHeader.class").exists()
assert new File(datatypeDirPath + File.separator + "Money.class").exists()
assert new File(datatypeDirPath + File.separator + "LinkDescription.class").exists()
assert new File(datatypeDirPath + File.separator + "ErrorDetails.class").exists()
assert new File(datatypeDirPath + File.separator + "Error.class").exists()

