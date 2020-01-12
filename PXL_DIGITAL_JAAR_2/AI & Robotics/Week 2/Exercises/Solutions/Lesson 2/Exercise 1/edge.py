class Edge:

    def __init__(self, node, cost=0):
        self.node = node
        self.cost = cost

    def to(self):
        return self.node
