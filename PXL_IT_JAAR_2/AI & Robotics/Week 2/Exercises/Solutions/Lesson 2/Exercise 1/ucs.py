#! /usr/bin/python3

from node import Node
from edge import Edge
from queue import PriorityQueue

def uniformCost(graph, startnode, goalnode):
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
                totalCost = cost + edge.cost
                newPath = path.copy()
                newPath.append(edge.node)
                queue.put((totalCost, newPath))