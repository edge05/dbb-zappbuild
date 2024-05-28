import com.ibm.dbb.build.* 

def doAlmostNothing = new MVSExec().pgm("IEFBR14")
println("Testing MVSExec of IEFBR14")
println("--------------------------")

def rc = doAlmostNothing.execute()

println("RC: " + rc)