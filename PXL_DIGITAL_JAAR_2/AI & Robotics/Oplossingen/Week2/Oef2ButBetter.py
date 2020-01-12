class Node:
    def __init__(self, value, left=None, right=None, discovered=False):
        self.value = value
        self.leftChild = left
        self.rightChild = right
        self.discovered = discovered

    def hasLeftChild(self):
        return self.leftChild

    def hasRightChild(self):
        return self.rightChild

    def isLeftChild(self):
        return self.parent and self.parent.leftChild == self

    def isRightChild(self):
        return self.parent and self.parent.rightChild == self

    def isRoot(self):
        return not self.parent

    def hasAnyChildren(self):
        return self.rightChild or self.leftChild

    def hasBothChildren(self):
        return self.rightChild and self.leftChild

    def replaceNodeData(self, value , lc, rc):
        self.payload = value
        self.leftChild = lc
        self.rightChild = rc
        if self.hasLeftChild():
            self.leftChild.parent = self
        if self.hasRightChild():
            self.rightChild.parent = self

    def printNode(self):
        print(self.value)
        if self.leftChild is not None:
            self.leftChild.printNode()
        if self.rightChild is not None:
            self.rightChild.printNode()


root = Node("Fa Fo Go Gr |")
root.leftChild = Node("Fo Gr | Fa Go")
root.leftChild.leftChild = Node("Fa Fo Gr | Go")
third = root.leftChild.leftChild
third.leftChild = Node("Gr | Fa Fo Go")
third.leftChild.leftChild = Node("Fa Go Gr | Fo")
third.leftChild.leftChild.leftChild = Node("Go | Fa Fo Gr")
third.rightChild = Node("Fo | Fa Go Gr")
third.rightChild.leftChild = Node("Fa Fo Go | Gr")
third.rightChild.leftChild.leftChild = Node("Go | Fa Fo Gr")
sixLeft = third.leftChild.leftChild.leftChild
sixRight = third.rightChild.leftChild.leftChild
sixLeft.leftChild = Node("Fa Go | Fo Gr")
sixLeft.rightChild = Node("Fa Fo Go | Gr")
sixLeft.leftChild.leftChild = Node("| Fa Fo Go Gr")
sixRight.leftChild = Node("Fa Go | Fo Gr", Node("| Fa Fo Go Gr"))
sixRight.rightChild = Node("Fa Go Gr | Fo", None, Node("Gr | Fa Fo Go"))

root.printNode()


def depth_first(v: Node):
    v.discovered = True

    if v.value != "| Fa Fo Go Gr":
        if v.leftChild is not None and v.leftChild.discovered is False:
            depth_first(v.leftChild)

        if v.rightChild is not None and v.rightChild.discovered is False:
            depth_first(v.rightChild)
    else:
        print(v.value)
        print("found")


print("Depth first search started")
depth_first(root)
