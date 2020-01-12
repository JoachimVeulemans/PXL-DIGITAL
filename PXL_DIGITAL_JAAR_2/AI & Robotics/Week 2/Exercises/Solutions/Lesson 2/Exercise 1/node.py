from edge import Edge


class Node:

    def __init__(self, label, heuristic = 0):
        self.edges = []
        self.label = label
        self.heuristic = heuristic

    def addEdge(self, node, cost = 0):
        self.edges.append(Edge(node, cost))

    def print(self):
        print(self.label + ': ')
        for edge in self.edges:
            print('-' + str(edge.node) + '(' + str(edge.cost) + ')')
	
    def __str__(self):
        return self.label
    def __repr__(self):
        return repr(self.label)

    def __lt__(self, other):
        return self.label < other.label