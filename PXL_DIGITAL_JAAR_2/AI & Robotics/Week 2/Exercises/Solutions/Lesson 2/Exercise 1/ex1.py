#! /usr/bin/python3

from node import Node
from graph import Graph
from ucs import uniformCost
from aStar import aStarIsBorn

#       0   1   2   3   4   5   6   7
#       S   A   B   C   D   E   F   G
#       -----------------------------
# 0 S   0   6   5   10  0   0   0   0
# 1 A   6   0   0   0   0   6   0   0
# 2 B   5   0   0   0   7   6   0   0
# 3 C   10  0   0   0   6   0   0   0
# 4 D   0   0   7   6   0   0   6   0
# 5 E   0   6   6   0   0   0   4   0
# 6 F   0   0   0   0   6   4   0   3
# 7 G   0   0   0   0   0   0   3   0

matrix = [
    [0, 6, 5, 10, 0, 0, 0, 0],
    [6, 0, 0, 0, 0, 6, 0, 0],
    [5, 0, 0, 0, 7, 6, 0, 0],
    [10, 0, 0, 0, 6, 0, 0, 0],
    [0, 0, 7, 6, 0, 0, 6, 0],
    [0, 6, 6, 0, 0, 0, 4, 0],
    [0, 0, 0, 0, 6, 4, 0, 3],
    [0, 0, 0, 0, 0, 0, 3, 0]
]
node_labels     =   ["S", "A", "B", "C", "D", "E", "F", "G"]
node_heuristics =   [ 0,   10,  13,  4,   2,   4,   1,   0]

graph = Graph()

for label, heuristic in zip(node_labels, node_heuristics):
    node = Node(label, heuristic)
    graph.append(node)

for node in graph.nodes:
    fromNode = node_labels.index(node.label)
    for toNode in range(0, len(node_labels)):
        if matrix[fromNode][toNode] != 0:
            graph.nodes[fromNode].addEdge(graph.nodes[toNode], matrix[fromNode][toNode])

graph.print()

print('uniformCost: ')
print('-------------')
print('paths traversed: ')
path = uniformCost(graph, graph.getNodeByLabel('S'), graph.getNodeByLabel('G'))
print('Final path: ' + str(path))
print('-------------')

print('A*: ')
print('-------------')
print('paths traversed: ')
path = aStarIsBorn(graph, graph.getNodeByLabel('S'), graph.getNodeByLabel('G'))
print('Final path: ' + str(path))
print('-------------')
