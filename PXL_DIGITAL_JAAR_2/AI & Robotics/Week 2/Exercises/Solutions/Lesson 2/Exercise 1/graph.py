class Graph:
    def __init__(self):
        self.nodes = []

    def getNodeByLabel(self, label):
        for node in self.nodes:
            if node.label == label:
                return node

    def append(self, node):
        self.nodes.append(node)

    def print(self):
        print('Graph')
        print('-----')
        for node in self.nodes:
            node.print()
        print('-----\n')
