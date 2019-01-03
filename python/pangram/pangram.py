import re

letters = "abcdefghijklmnopqrstuvwxyz"


def is_pangram(sentence):
    sentence = sentence.replace(" ", "").lower()
    sentence = re.sub(r"[^A-Za-z]+", '', sentence)

    total = 0

    for l in letters:
        if sentence.count(l) != 0:
            total += 1

    if total == 26:
        return True
    else:
        return False
    pass
