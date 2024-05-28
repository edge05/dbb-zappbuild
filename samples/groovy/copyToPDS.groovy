import com.ibm.dbb.build.CopyToPDS
println('Copy USS file to PDS as member')
PDSname = "JEDGING.TEST.PDS"
def copyFile = new CopyToPDS
copyFile.setDataset(PDSname)
//
copyFile.setFile(new File("./SYSIN/file1.txt"))
copyFile.setMember("FILE1")
copyFile.execute()
//
copyFile.setFile(new File("./SYSIN/file2.txt"))
copyFile.setMember("FILE2")
copyFile.execute()