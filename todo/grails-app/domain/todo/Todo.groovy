package todo

class Todo {

	String subject
	Date dueDate
	Integer priority
	String description

    static constraints = {
    	subject(blank:false, unique:true)
    	dueDate()
    	priority()
    	description(size:0..100)
    }
}
