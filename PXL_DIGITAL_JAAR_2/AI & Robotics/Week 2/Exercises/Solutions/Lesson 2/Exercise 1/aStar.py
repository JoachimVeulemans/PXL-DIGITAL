from node import Node
from edge import Edge
from queue import PriorityQueue

def queueContains(queue, costP, node):
    for costQ, pathQ in list(queue.queue):
        if node in pathQ and costP >= costQ:
            return True

def aStarIsBorn(graph, startnode, goalnode):
    queue = PriorityQueue()
    queue.put((0, [startnode]))

    while not queue.empty():
        cost, path = queue.get()
        
        print(path)

        lastNode = path[len(path) - 1]

        if lastNode == goalnode:
            return path

        for edge in lastNode.edges:
            if edge.node not in path:
                totalCost = cost + edge.cost - lastNode.heuristic + edge.node.heuristic
                newPath = path.copy()
                newPath.append(edge.node)

                if not queueContains(queue, totalCost, edge.node):
                    queue.put((totalCost, newPath))