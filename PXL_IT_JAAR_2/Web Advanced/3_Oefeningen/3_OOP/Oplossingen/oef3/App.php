<?php

require('textnode/TextNode.php');
$n=textnode\TextNode::makeNode("a");
$n->addNode("b");
$n->addNode("c");
$n->printAll();

$n=textnode\TextNode::makeNode("a");
$n->addNode("b");
$n->addNode("c");
$n->printTextNodeAt(2);
