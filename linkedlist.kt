fun main() {
    var a = Node(null)
    print("Enter Your Total Data : ")
    var size = readLine()!!.toInt()
    a.linkedlist(size)
}

class Node {
    var next: Node?
    var data: Int?
    var head: Node? = null
    constructor(data: Int?) {
        this.next = null
        this.data = data
    }
    fun linkedlist(size: Int) {
        var x = 0
        while (x < size) {
            print("Enter Your ${x+1} Data : ")
            var data = readLine()!!.toInt()
            var new_Node = Node(data)
            if (head == null) {
                head = new_Node
            } else {
                new_Node.next = head
                head = new_Node
            }
            x++
        }
        run()
    }
    fun run() {
        if (head == null) {
            println("this linkedlist is null")
        } else {
            var temp = head
            println("Linked is print...")
            while (temp != null) {
                print("${temp.data} -> ")
                temp = temp.next
            }
            print("Null")
        }
    }
}
