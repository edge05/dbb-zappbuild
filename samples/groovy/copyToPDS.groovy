import com.ibm.dbb.build.CopyToPDS
println('Copy USS file to PDS as member')
def copyFile = new CopyToPDS
copyFile.setDataset("JEDGING.TEST.PDS")
//
copyFile.setFile(new File("./SYSIN/file1.txt"))
copyFile.setMember("FILE1")
copyFile.execute()
//
copyFile.setFile(new File("./SYSIN/file2.txt"))
copyFile.setMember("FILE2")
copyFile.execute()